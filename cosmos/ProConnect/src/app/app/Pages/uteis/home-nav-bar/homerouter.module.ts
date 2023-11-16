import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from '../../login/login.component';
import { PrincipalComponent } from '../../Pincipal/principal.component';
import { CadastroComponent } from '../../cadastro/cadastro.component';
import { PagInicialComponent } from '../../pag-inicial/pag-inicial.component';



const routes: Routes = [
  {path: 'teste'},
  {path: 'projetos'},
  {path: 'user', component:PagInicialComponent},
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes),
  ],
  exports: [RouterModule]
})
export class RouterinitialModule { }
