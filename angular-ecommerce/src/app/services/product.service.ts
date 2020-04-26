import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from '../common/product';
import { Observable } from 'rxjs';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  baseUrl = 'http://localhost:8080/api/products';

  constructor(private httpClient:HttpClient) { }

  getProductList():Observable<Product[]>{

    return this.httpClient.get<Response>(this.baseUrl).pipe(
      map(response=>response._embedded.products)
    );
    }
  }

  interface Response{
    _embedded:{
      products:Product[];
    }
  } 


  


