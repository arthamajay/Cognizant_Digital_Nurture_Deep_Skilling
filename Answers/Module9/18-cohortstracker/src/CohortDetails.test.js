import React from 'react';
import { mount, shallow } from 'enzyme';
import CohortDetails from './CohortDetails';
import { CohortData } from './Cohort';

describe('Cohort Details Component', () => {
  test('should create the component', () => {
    const wrapper = shallow(<CohortDetails cohort={CohortData[0]} />);
    expect(wrapper.exists()).toBe(true);
  });

  test('should initialize the props', () => {
    const sampleCohort = CohortData[0];
    const wrapper = mount(<CohortDetails cohort={sampleCohort} />);
    expect(wrapper.props().cohort).toEqual(sampleCohort);
  });

  test('should display cohort code in h3', () => {
    const sampleCohort = CohortData[0];
    const wrapper = mount(<CohortDetails cohort={sampleCohort} />);
    const h3Text = wrapper.find('h3').text();
    expect(h3Text).toContain(sampleCohort.cohortCode);
  });

  test('should always render same html', () => {
    const sampleCohort = CohortData[0];
    const wrapper = shallow(<CohortDetails cohort={sampleCohort} />);
    expect(wrapper).toMatchSnapshot();
  });
});