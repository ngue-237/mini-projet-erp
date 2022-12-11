import { Component, OnInit } from '@angular/core';
import { Client } from 'src/app/Models/client';
import { ClientService } from 'src/app/Services/client.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {


  clients: Client[]=[];
  constructor(private clientService: ClientService) { }

  ngOnInit(): void {
    this.clientService.getCLient().subscribe((data: Client[]) => {
      console.log(data);
      this.clients = data;
    });
  }
  delete(id:number){
    console.log("test");
    this.clientService.delete(id).subscribe();
   }
  }



