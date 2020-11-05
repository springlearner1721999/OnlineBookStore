import { Component, OnInit } from '@angular/core';
import { BookServiceService } from 'src/app/book-service.service';
import { Bookcatagory } from 'src/app/common/bookcatagory';

@Component({
  selector: 'app-book-catagory',
  templateUrl: './book-catagory.component.html',
  styleUrls: ['./book-catagory.component.css']
})
export class BookCatagoryComponent implements OnInit {

  bookCatagorys: Bookcatagory[];

  constructor(private bookservice: BookServiceService) { }

  ngOnInit(): void {
    this.bookservice.getBookCatagory().subscribe((data)=> this.bookCatagorys = data);
  }




}
