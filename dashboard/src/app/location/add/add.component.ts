import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Client } from 'src/app/Models/client';
import { ClientService } from 'src/app/Services/client.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  client = new Client;
  constructor(private clientService :ClientService, private router: Router) { }

  ngOnInit(): void {
    this.client=new Client();
  }

  save(){
    this.clientService.create(this.client).subscribe (res => {
      //this.toastr.success('Employe a été ajouter','Ajout')
    console.log('client created!');
    this.router.navigateByUrl('/gestion-location/client');});
  }
}
