import React, { useState, useEffect } from "react";

const UserList = () => {
    const [users, setUsers] = useState([]);
    useEffect(() => {
        fetch('http://localhost:8080/users')
            .then((response) => response.json())
            .then((data) => {
                console.log(data);
                setUsers(data);
            })
            .catch((err) => {
                console.log(err.message);
            });
    }, []);

    return (
        <div className="users-container px-5">
            <div>
                <table className="table table-dark">
                    <thead>
                        <tr>
                            <th scope="col">First</th>
                            <th scope="col">Last</th>
                            <th scope="col">Major</th>
                            <th scope="col">Phone Number</th>
                        </tr>
                    </thead>
                    <tbody>
                        {users.map((user) => {
                            return (
                                <tr key={user.id}>
                                    <td className="first-name">{user.firstName}</td>
                                    <td className="last-name">{user.lastName}</td>
                                    <td className="major">{user.major}</td>
                                    <td className="phone-no">{user.phoneNo}</td>
                                </tr>
                        )})}
                    </tbody>
                </table>
            </div>
        </div>
    );
}

export default UserList;