import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs'
@Injectable({
  providedIn: 'root'
})
export class ApiService {
  codigo
  constructor(private http: HttpClient) { }
  obterListaPaises(): Observable<any>{
    return this.http.get<any>("http://localhost:8080/banco/paises")
} 
  obterInfoPais(): Observable<any>{
    return this.http.get<any>("http://localhost:8080/banco/"+this.codigo)
  }
}
