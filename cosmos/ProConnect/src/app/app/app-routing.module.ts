import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './Pages/login/login.component';
import { PrincipalComponent } from './Pages/Pincipal/principal.component';
import { PagInicialComponent } from './Pages/pag-inicial/pag-inicial.component';
import { CadastroComponent } from './Pages/cadastro/cadastro.component';

const routes: Routes = [
  {path:'login', component:LoginComponent},
  {path:'user', component:PagInicialComponent},
  {path:'home', component:PrincipalComponent},
  {path: 'cadastro', component:CadastroComponent},
  {path: '**', component: PrincipalComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
