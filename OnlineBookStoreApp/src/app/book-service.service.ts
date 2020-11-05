import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Book } from './common/book';
import { Bookcatagory } from './common/bookcatagory';

@Injectable({
  providedIn: 'root'
})
export class BookServiceService {

  constructor(private http: HttpClient) { }

  getBookCatagory():Observable<Bookcatagory[]>{
    return this.http.get<GetCatagoryResponse>("http://localhost:8099/api/bookTypes").pipe(
      map(response => response._embedded.bookTypes)
    );
  }
 
  getBookListByCatagory(id: number):Observable<Book[]>{
    return this.http.get<GetResponse>("http://localhost:8099/api/book/search/findBybookTypeId?id=" + id)
                .pipe( map(response => response._embedded.books));
  }

  getBookBySearch(keyword: string):Observable<Book[]>{
    return this.http.get<GetResponse>("http://localhost:8099/api/book/search/findByNameContaining?name="
     + keyword)
                .pipe( map(response => response._embedded.books));
  }
}


interface GetResponse{
  _embedded: {
     books : Book[];
  }
}

interface GetCatagoryResponse{
  _embedded: {
     bookTypes : Bookcatagory[];
  }
}