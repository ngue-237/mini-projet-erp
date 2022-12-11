import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/Models/user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user= User;
  constructor() { }

  ngOnInit(): void {
  }

  login(){
    console.log("clicked")
  }
}
