import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { State } from 'src/app/Class/state';
import { Gender } from 'src/app/Class/gender';
import { Scholarity } from 'src/app/Class/scholarity';
import { Maritalstatus } from 'src/app/Class/maritalstatus';

@Injectable({
  providedIn: 'root'
})
export class ConfigGeralServicesService {

  constructor(private http:HttpClient) { }
  buildStateDrop(): State[]{
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

  buildGenderDrop(): Gender[]{
    const genderList:Gender[] = [];
    const url = `http://localhost:8080/gender/all`
    this.http.get<Gender[]>(url).subscribe(
      (Response:Gender[]) => {
        genderList.push(...Response)
      }
    );
    return genderList;
  }
  buildScholarityDrop():Scholarity[]{
    const scholarityList:Scholarity[] = [];
    const url = `http://localhost:8080/scholarity/all`
    this.http.get<Scholarity[]>(url).subscribe(
      (Response:Scholarity[]) => {
        scholarityList.push(...Response)
      }
    );
    return scholarityList;
  }

  buildMaritalStatusDrop():Maritalstatus[]{
    const maritalStatusList:Maritalstatus[] = [];
    const url = `http://localhost:8080/marital-status/all`
    this.http.get<Maritalstatus[]>(url).subscribe(
      (Response:Maritalstatus[]) => {
        maritalStatusList.push(...Response)
      }
    );
    return maritalStatusList;
  }
}
