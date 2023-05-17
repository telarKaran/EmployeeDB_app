import React, { useState, useEffect } from 'react';
import { getEmployees, addEmployee, updateEmployee, deleteEmployee } from './Api';

const Employee = () => {
  const [employees, setEmployees] = useState([]);
  const [employee, setEmployee] = useState({ id: '0', name: '', salary: '' });
  const [isEdit, setIsEdit] = useState(false);

  useEffect(() => {
    getEmployees()
      .then(res => setEmployees(res.data))
      .catch(err => console.log(err));
  }, []);

  const handleInputChange = (event) => {
    const { name, value } = event.target;
    setEmployee({ ...employee, [name]: value });
  }

  const handleAdd = () => {
    addEmployee(employee)
      .then(res => {
        setEmployees([...employees, res.data]);
        setEmployee({ id: ++this.id, name: '', salary: '' });
      })
      .catch(err => console.log(err));
  }

  const handleEdit = () => {
    updateEmployee(employee.id, employee)
      .then(res => {
        setEmployees(employees.map(emp => (emp.id === res.data.id ? res.data : emp)));
        setEmployee({ id: '', name: '', salary: '' });
        setIsEdit(false);
      })
      .catch(err => console.log(err));
  }

  const handleDelete = (id) => {
    deleteEmployee(id)
      .then(res => {
        setEmployees(employees.filter(emp => emp.id !== id));
      })
      .catch(err => console.log(err));
  }

  const handleEditClick = (emp) => {
    setEmployee(emp);
    setIsEdit(true);  
  }

  const handleCancelClick = () => {
    setEmployee({ id: '', name: '', salary: '' });
    setIsEdit(false);
  }

  return (
    <div>
        <h2>{isEdit ? 'Edit Employee' : 'Add Employee'}</h2>
      <form>
        {/* <label>ID:</label>
        <input type="text" name="id" value={employee.id} onChange={handleInputChange} /><br /> */}

        <label>Name:</label>
        <input type="text" name="name" value={employee.name} onChange={handleInputChange} /><br />

        <label>Salary:</label>
        <input type="text" name="salary" value={employee.salary} onChange={handleInputChange} /><br />

        {isEdit ? (
          <div>
            <button type="button buttonupdate" onClick={handleEdit}>Update</button>
            <button type="button" onClick={handleCancelClick}>Cancel</button>
          </div>
        ) : (
          <button type="button" onClick={handleAdd}>Add</button>
        )}
      </form>
      <h2>Employee List</h2>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Salary</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {employees.map(emp => (
            <tr key={emp.id}>
              <td>{emp.id}</td>
              <td>{emp.name}</td>
              <td>{emp.salary}</td>
              <td>
                <button onClick={() => handleEditClick(emp)}>Edit</button>
                <button onClick={() => handleDelete(emp.id)}>Delete</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>

    </div>);
   
        }

        
export default Employee;