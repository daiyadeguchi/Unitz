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
        <div className="users-container">
            {users.map((user) => {
                return (
                    <div className="user-id" key={user.id}>
                        <h2 className="first-name">{user.firstName}</h2>
                        <h2 className="last-name">{user.lastName}</h2>
                        <h3 className="major">{user.major}</h3>
                        <h3 className="phone-no">{user.phoneNo}</h3>
                    </div>
                );
            })}
        </div>
    );
}

export default UserList;