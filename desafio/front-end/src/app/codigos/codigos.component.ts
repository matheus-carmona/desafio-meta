import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/api/api.service';

@Component({
  selector: 'app-codigos',
  templateUrl: './codigos.component.html',
  styleUrls: ['./codigos.component.css']
})
export class CodigosComponent implements OnInit {
  paises = [];
  constructor(
    private api: ApiService
  ) { }

  ngOnInit(): void {
    this.api.obterListaPaises().subscribe(data => {
      this.paises = data["wb:countries"]["wb:country"]
      })
  }

}
