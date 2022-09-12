export interface SchedulingProps{
  customer: string
  startsAt: Date
  endsAt: Date

}

export class Scheduling {
  private props: SchedulingProps

  get customer(){
    return this.props.customer
  }
  get startsAt(){
    return this.props.startsAt
  }
  get endsAt(){
    return this.props.endsAt
    } 

    constructor(props: SchedulingProps){
      this.props = props
    }
  }