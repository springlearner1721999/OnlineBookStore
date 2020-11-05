import { Component, OnInit } from '@angular/core';
import { Subscriber } from 'rxjs';
import {ActivatedRoute} from '@angular/router';
import { BookServiceService } from 'src/app/book-service.service';
import { Book } from 'src/app/common/book';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  constructor(private book_service: BookServiceService,private activatedRoute: ActivatedRoute) { }

  hasCatagoryid: boolean;
  Books: Book[];
  id: number;
  search: boolean;
  keyword: string;
  
  ngOnInit(): void {
     this.activatedRoute.paramMap.subscribe((data)=> {
       this.getparam();
     })

     
  }

  getparam(){
    this.search = this.activatedRoute.snapshot.paramMap.has('keyword');
    if(this.search){
      this.getSerchBook();
    }
    else{
      this.getBook();
    }
  }

  getBook(): void{
    this.hasCatagoryid = this.activatedRoute.snapshot.paramMap.has('id');
     if(this.hasCatagoryid){
       
      this.id = +this.activatedRoute.snapshot.paramMap.get('id');
      this.book_service.getBookListByCatagory(this.id).subscribe((data)=> this.Books = data);
     }
     else{
      this.id = 1;
      this.book_service.getBookListByCatagory(this.id).subscribe((data)=> this.Books = data);
     }
  }

  getSerchBook(){
    this.keyword = this.activatedRoute.snapshot.paramMap.get('keyword');
    this.book_service.getBookBySearch(this.keyword).subscribe((data)=> this.Books = data);
  }
 

}
