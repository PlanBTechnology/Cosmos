import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './Pages/login/login.component';
import { PrincipalComponent } from './Pages/Pincipal/principal.component';
import { PagInicialComponent } from './Pages/pag-inicial/pag-inicial.component';

const routes: Routes = [
  {path:'login', component:LoginComponent},
  {path:'main', component:PrincipalComponent},
  {path:'home', component:PagInicialComponent},
  {path: '**', component: PrincipalComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
