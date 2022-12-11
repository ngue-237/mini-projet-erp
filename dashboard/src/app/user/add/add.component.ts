import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/Models/user';
import { UserService } from 'src/app/Services/user.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  user = new User;
  constructor(private userService :UserService, private router: Router) { }

  ngOnInit(): void {
    this.user=new User();
  }

  save(){
    this.userService.create(this.user).subscribe (res => {
    console.log('User created!');
    this.router.navigateByUrl('/gestion-employe');});
  }
}
