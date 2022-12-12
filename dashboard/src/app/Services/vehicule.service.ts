import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router, UrlHandlingStrategy } from '@angular/router';
import { Observable, VirtualTimeScheduler } from 'rxjs';
import { Vehicule } from '../Models/vehicule';

@Injectable({
  providedIn: 'root'
})
export class VehiculeService {
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }
  constructor(private http: HttpClient, private router:Router) { }
  private baseUrl="/api/api/vehicules"; 

  getVehicules(): Observable<Vehicule[]>{
    return this.http.get<Vehicule[]>(`${this.baseUrl}`); 
  }
  addVehicule(v:Vehicule): Observable<Vehicule>{
    return this.http.post<Vehicule>(this.baseUrl, JSON.stringify(v),this.httpOptions)
  }

  updatevehicule(id:number,v:Vehicule): Observable<Vehicule> {
    return this.http.put<Vehicule>(this.baseUrl  + id, JSON.stringify(v), this.httpOptions)
  }

  deletevehicule(id:number){
    return this.http.delete<Vehicule>(this.baseUrl +'/'+id, this.httpOptions)
  }

  findvVehicule(id:number): Observable<Vehicule>{
    return this.http.get<Vehicule>(this.baseUrl +'/'+ +id)
  }
 /* deletevehicule;
  updatevehicule;
  addVehicule;
  findvVehicule;
  */
}
