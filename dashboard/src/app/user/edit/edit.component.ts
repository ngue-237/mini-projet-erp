import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/Models/user';
import { UserService } from 'src/app/Services/user.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
user =new User();
  constructor(private userService:UserService, private router: Router) { }

  ngOnInit(): void {
  }
  update(){
    this.userService.update(this.user.id,this.user).subscribe();}
}
