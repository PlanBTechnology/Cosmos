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
import { CadastroComponent } from './Pages/cadastro/cadastro.component';
import { HomeNavBarComponent } from './Pages/uteis/home-nav-bar/home-nav-bar.component';
import { BoxContentComponent } from './Pages/uteis/box-content/box-content.component';
import { MainContentComponent } from './Pages/uteis/main-content/main-content.component';
import { TelatesteComponent } from './Pages/telateste/telateste.component';
import { CadMenuComponent } from './Pages/cadastro/uteis/cad-menu/cad-menu.component';
import { FooterPageComponent } from './Pages/uteis/footer-page/footer-page.component';
import { CadComplementoComponent } from './Pages/cadastro/uteis/cad-complemento/cad-complemento.component';
import { CadService } from './services/operations/cad.service';
import { LoginService } from './services/operations/login.service';
import { UserService } from './services/operations/user.service';
import { LocalStorageService } from './services/operations/local-storage.service';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    PagInicialComponent,
    PrincipalComponent,
    PincipalNavBarComponent,
    CadastroComponent,
    HomeNavBarComponent,
    BoxContentComponent,
    MainContentComponent,
    TelatesteComponent,
    CadMenuComponent,
    FooterPageComponent,
    CadComplementoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    CadService,
    LoginService,
    UserService,
    LocalStorageService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
