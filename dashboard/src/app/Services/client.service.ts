import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Client } from '../Models/client';

@Injectable({
  providedIn: 'root',
})
export class ClientService {
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    }),
  };
  constructor(private http: HttpClient) {}
  private baseUrl =
    '/api/car-location-service/client';
  getCLient(): Observable<Client[]> {
    return this.http.get<Client[]>(`${this.baseUrl}/all-clients`);
  }
  create(client: Client): Observable<Client> {
    return this.http.post<Client>(
      this.baseUrl,
      JSON.stringify(client),
      this.httpOptions
    );
  }
  getById(id: string): Observable<Client> {
    return this.http.get<Client>(this.baseUrl + '/' + +id);
  }

  update(email:string, client: Client): Observable<Client> {
    return this.http.put<Client>(
      this.baseUrl+'/update/' + email,
      JSON.stringify(client),
      this.httpOptions
    );
  }

  delete(id: number) {
    return this.http.delete<Client>(this.baseUrl + '/' + id, this.httpOptions);
  }
}
