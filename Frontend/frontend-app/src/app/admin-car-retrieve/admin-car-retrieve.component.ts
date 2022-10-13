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
  flag:boolean = false;
  cid:number =0;
  cprice:number =0;
  url:string = "";
  findAllCar(){
   this.cs.findAllCar().subscribe({
    next:(result:any)=>this.cars=result,
    error:(error:any)=>console.log(error),
    complete:()=>console.log("completed")
   })
  }

  deleteCar(cid:number){
    //console.log(cid)
    this.cs.deleteCarById(cid).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{
        this.findAllCar();
      }
     })
  }

  updateCar(car:any){
   this.flag = true;
   this.cid=car.cid;
   this.cprice=car.cprice;
   this.url=car.url;
  }

  updateDataFromDb(){
    let product = {cid:this.cid,cprice:this.cprice,url:this.url};
    this.cs.updateCar(Car).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{
        this.findAllCar();
      }
     })
     this.flag=false;
  }
}
