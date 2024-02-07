import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { State } from 'src/app/Class/state';

@Injectable({
  providedIn: 'root'
})
export class ConfigGeralServicesService {

  constructor(private http:HttpClient) { }
  MontaStateDrop(): State[]{
    const stateList:State[] = [];
    const url = `http://localhost:8080/state/all`
    this.http.get<State[]>(url).subscribe(
      (Response:State[]) => {
        for (let key in Response){
          let s = new State();
          s.stateName = Response[key].stateName;
          s.id = Response[key].id;
          stateList.push(s);
        }
      }
    );
    return stateList;
  }



}
