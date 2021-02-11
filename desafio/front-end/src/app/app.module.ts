import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http'
import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaPaisesComponent } from './lista-paises/lista-paises.component';
import { CodigosComponent } from './codigos/codigos.component';
import { InfoPaisComponent } from './info-pais/info-pais.component';

@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    ListaPaisesComponent,
    CodigosComponent,
    InfoPaisComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
