import { Component, OnInit } from '@angular/core';
import { Car } from '../car';
import { CarService } from '../car.service';

@Component({
  selector: 'app-admin-car-retrieve',
  templateUrl: './admin-car-retrieve.component.html',
  styleUrls: ['./admin-car-retrieve.component.css']
})
export class AdminCarRetrieveComponent implements OnInit {

  cars:Array<Car>=[];
  constructor(public cs:CarService) { }

  ngOnInit(): void {
    this.findAllCar();
  }

  findAllCar(){
   this.cs.findAllCar().subscribe({
    next:(result:any)=>this.cars=result,
    error:(error:any)=>console.log(error),
    complete:()=>console.log("completed")
   })
  }
}
