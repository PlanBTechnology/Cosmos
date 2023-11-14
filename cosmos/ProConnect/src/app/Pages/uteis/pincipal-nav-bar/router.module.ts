import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from '../../login/login.component';
import { PrincipalComponent } from '../../Pincipal/principal.component';



const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'home', component:PrincipalComponent},
  {path: '**', component: PrincipalComponent}

];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes),
  ],
  exports: [RouterModule]
})
export class RouterinitialModule { }
