import { Injectable } from '@angular/core';
import {catchError, Observable, throwError} from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ContratLoc } from '../Models/contrat-loc';


@Injectable({
  providedIn: 'root'
})
export class ContratService {
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }
  constructor(private http:HttpClient) { }
  private baseUrl = "/api/car-location-service/contrat-loctation";

  getContrats(): Observable<ContratLoc[]>{
    return this.http.get<ContratLoc[]>(`${this.baseUrl}`);
  }
  create(contrat:ContratLoc): Observable<ContratLoc> {
    return this.http.post<ContratLoc>(this.baseUrl, JSON.stringify(contrat), this.httpOptions)
  }
  getById(ref:any): Observable<ContratLoc> {
    return this.http.get<ContratLoc>(this.baseUrl +'/'+  + ref)
  }

  update(ref:any,contrat:ContratLoc): Observable<ContratLoc> {
    return this.http.put<ContratLoc>(this.baseUrl  + ref, JSON.stringify(contrat), this.httpOptions)

  }

  delete(ref: any){
    return this.http.delete<ContratLoc>(this.baseUrl+ ref, this.httpOptions)
  }
}
