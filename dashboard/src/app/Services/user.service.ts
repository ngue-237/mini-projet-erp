import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../Models/user';
import {catchError, Observable, throwError} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }
  constructor(private http:HttpClient) { }
  private baseUrl = "http://localhost:8080/userManager/";

  getUsers(): Observable<User[]>{
    return this.http.get<User[]>(`${this.baseUrl}`);
  }
  create(user:User): Observable<User> {
    return this.http.post<User>(this.baseUrl, JSON.stringify(user), this.httpOptions)
  }  
  getById(id:string): Observable<User> {
    return this.http.get<User>(this.baseUrl +'/'+  + id)
  }

  update(id:string,user:User): Observable<User> {
    return this.http.put<User>(this.baseUrl  + id, JSON.stringify(user), this.httpOptions)
   
  }

  delete(id: String){
    return this.http.delete<User>(this.baseUrl+ id, this.httpOptions)
  }

}