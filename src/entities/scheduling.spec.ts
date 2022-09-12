import {expect, test} from 'vitest'
import {Scheduling} from './scheduling'

test('creat an scheduling', () => {
  const scheduling = new Scheduling({
    customer: 'John Doe',
    startsAt: new Date(),
    endsAt: new Date()
  })

  expect(scheduling).toBeInstanceOf(Scheduling)
  expect(scheduling.customer).toEqual('John Doe')
});