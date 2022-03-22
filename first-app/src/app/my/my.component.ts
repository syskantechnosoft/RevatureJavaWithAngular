import { Component, OnInit } from '@angular/core';
import { Customer } from './customer';

@Component({
  selector: 'app-my',
  templateUrl: './my.component.html',
  styleUrls: ['./my.component.css']
})
export class MyComponent implements OnInit {

  customers : Customer[] = [
    {id : 234 , name: 'John'},
    {id : 235 , name: 'Adam'},
    {id : 236 , name: 'Nick'}
  ];

  constructor() { }

  ngOnInit(): void {

    this.customers  = [
      {id : 234 , name: 'John'},
      {id : 235 , name: 'Adam'},
      {id : 236 , name: 'Nick'}
    ];
  }

}
