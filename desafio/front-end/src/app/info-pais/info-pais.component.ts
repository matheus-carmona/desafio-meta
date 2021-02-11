import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/api/api.service';

@Component({
  selector: 'app-info-pais',
  templateUrl: './info-pais.component.html',
  styleUrls: ['./info-pais.component.css']
})
export class InfoPaisComponent implements OnInit {
  infoPais =[]
  erro = false
  constructor(
    private api: ApiService
  ) { }
    
  ngOnInit(): void {
    this.api.obterInfoPais().subscribe(data =>{
        this.infoPais = data["wb:data"]["wb:data"].filter(info =>{
          if(info["wb:value"] != ""){
            return info
          }
        })
    },error => {
      this.erro = true
    })
  }

}
