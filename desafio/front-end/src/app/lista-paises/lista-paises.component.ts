import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'
import { ApiService } from 'src/api/api.service';
@Component({
  selector: 'app-lista-paises',
  templateUrl: './lista-paises.component.html',
  styleUrls: ['./lista-paises.component.css']
})
export class ListaPaisesComponent implements OnInit {
  codigosValidos = []
  erro = false;
  constructor( 
    private router: Router,
    private api: ApiService
    ) { }

  ngOnInit(): void {
    this.api.obterListaPaises().subscribe(data =>{
      this.codigosValidos = data["wb:countries"]["wb:country"].map(codigo =>{
        return(codigo["wb:iso2Code"])
      })
    })
  }
  enviar(codigo){
    if(this.codigosValidos.includes(codigo)){
       this.api.codigo = codigo
       this.router.navigateByUrl("/info-pais")}
     else{
       this.erro = true;
     }  
  }
}
