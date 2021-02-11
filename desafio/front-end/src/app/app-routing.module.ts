import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CodigosComponent } from './codigos/codigos.component';
import { InfoPaisComponent } from './info-pais/info-pais.component';
import { ListaPaisesComponent } from './lista-paises/lista-paises.component';

const routes: Routes = [
  {path:"", component:ListaPaisesComponent},
  {path:"codigos", component:CodigosComponent},
  {path:"info-pais", component:InfoPaisComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [ListaPaisesComponent,CodigosComponent,InfoPaisComponent]
