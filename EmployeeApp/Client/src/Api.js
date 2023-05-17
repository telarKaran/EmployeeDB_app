import axios from 'axios';

const URL = 'http://localhost:8080/employees/';

export const getEmployees = () => axios.get(URL);

export const addEmployee = (employee) => axios.post(URL, employee);

export const updateEmployee = (id, employee) => axios.put(`${URL}${id}`, employee);

export const deleteEmployee = (id) => axios.delete(`${URL}${id}`);
