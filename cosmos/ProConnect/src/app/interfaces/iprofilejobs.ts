import { Job } from "../Class/job";
import { Profile } from "../Class/profile";


export interface Iprofilejobs {
 PkProfileJobs:PkProfilejobs
 experience:number
}

export type PkProfilejobs ={
  profileId:Profile
  jobId:Job
}



