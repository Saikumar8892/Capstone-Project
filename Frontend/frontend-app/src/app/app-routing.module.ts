import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { LoginComponent } from './login/login.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';
import { SignupComponent } from './signup/signup.component';
import { AddCarComponent } from './add-car/add-car.component';
import { AdminCarRetrieveComponent } from './admin-car-retrieve/admin-car-retrieve.component';

const routes: Routes = [
  {path:"login",component:LoginComponent},
  {path:"adminHome",component:AdmindashboardComponent,children:[
  {path:"addCar",component:AddCarComponent},
  {path:"findAllCar",component:AdminCarRetrieveComponent}
  
  ]},
  {path:"userHome",component:UserdashboardComponent},
  {path:"signUp",component:SignupComponent},
  
  {path:"",redirectTo:"login",pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
