import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Client } from 'src/app/Models/client';
import { ClientService } from 'src/app/Services/client.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  client =new Client();
  constructor(private clientService:ClientService, private router: Router) { }

  ngOnInit(): void {
  }
  update(){
    this.clientService.update(this.client.email,this.client).subscribe(res => {
      //this.toastr.success('Employe a été ajouter','Ajout')
    console.log('client created!');
    this.router.navigateByUrl('/gestion-location/client');});
  }
}
