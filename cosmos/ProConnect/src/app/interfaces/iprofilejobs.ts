import { IJob } from "./ijob";
import { Iprofile } from "./iprofile";


export interface Iprofilejobs {

  PKProfileJobs:PkProfilejobs
  experience:number

 getPKProfileJobs():PkProfilejobs
 setPKProfileJobs(pkProfileJobs:PkProfilejobs):void

 getExperience():number
 setExperience(experience:number):void
}

export type PkProfilejobs ={
  profileId:Iprofile
  jobId:IJob
}



