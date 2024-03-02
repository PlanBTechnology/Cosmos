import { IJob } from "../interfaces/ijob";

export class Job implements IJob{
  jobId: number = 0;
  jobName: string = '';


  getJobId(): number { return this.jobId}
  setJobId(jobId: number): void {this.jobId= jobId}

  getJobName(): string {return this.jobName}
  setJobName(jobName: string): void {this.jobName = jobName}
}
