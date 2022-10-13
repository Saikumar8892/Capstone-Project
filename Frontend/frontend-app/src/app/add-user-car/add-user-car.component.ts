import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { CarService } from '../car.service';

@Component({
  selector: 'app-add-user-car',
  templateUrl: './add-user-car.component.html',
  styleUrls: ['./add-user-car.component.css']
})
export class AddUserCarComponent implements OnInit {
  carRef = new FormGroup({
    cname:new FormControl(),
    cprice:new FormControl(),
    cmodel:new FormControl(),
    url:new FormControl()
  })
  storeMsg :string =""
  constructor(public cs:CarService) { }

  ngOnInit(): void {
  }

  storeCar() {
    let car = this.carRef.value;
    this.cs.storeCar(car).subscribe({
     next:(result:any)=>this.storeMsg=result,
     error:(error:any)=>console.log(error),
     complete:()=>console.log("completed")
    })

    this.carRef.reset();
  }
}
