import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Car } from './car';

@Injectable({
  providedIn: 'root'
})
export class CarService {
  baseUrl:string = "http://localhost:9090/car"
  constructor(public http:HttpClient) { }

  storeCar(car:any):Observable<string>{
    return this.http.post(this.baseUrl+"/storeCar",car,{responseType:"text"});
  }

  updateCar(car:any):Observable<string>{
    return this.http.patch(this.baseUrl+"/updateCar",car,{responseType:"text"});
  }

  findAllCar():Observable<Car[]>{
    return this.http.get<Car[]>(this.baseUrl+"/findAllCar");
  }

  deleteCarById(cid:number):Observable<string>{
    return this.http.delete(this.baseUrl+"/deleteCar/"+cid,{responseType:"text"});
  }
}
