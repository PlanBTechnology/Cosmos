import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { State } from 'src/app/Class/state';
import { Gender } from 'src/app/Class/gender';
import { Scholarity } from 'src/app/Class/scholarity';
import { Maritalstatus } from 'src/app/Class/maritalstatus';
import { Job } from 'src/app/Class/job';


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
          stateList.push(...Response);
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

  buildJobDrop():Job[]{
    const jobList:Job[] = [];
    const url = `http://localhost:8080/job/all`
    this.http.get<Job[]>(url).subscribe(
      (Response:Job[]) => {
        jobList.push(...Response)
      }
    )
    return jobList
  }
}

