import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './Pages/login/login.component';
import { FormsModule } from '@angular/forms';
import { PagInicialComponent } from './Pages/pag-inicial/pag-inicial.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { PrincipalComponent } from './Pages/Pincipal/principal.component';
import { PincipalNavBarComponent } from './Pages/uteis/pincipal-nav-bar/pincipal-nav-bar.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    PagInicialComponent,
    PrincipalComponent,
    PincipalNavBarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
