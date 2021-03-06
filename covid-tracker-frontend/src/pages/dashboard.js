import React, { Component } from 'react'; 
import { Bar } from 'react-chartjs-2'; 

class DashBoard extends Component {

    constructor() {  
        super();  
  
        this.state = { 
            Data: {}
            };   
        this.getWorldData = this.getWorldData.bind(this); 
    } 


    render(){                                                                                                                                                                                                                                                                                               
        return (<div>
            
            
            <Bar data={this.state.Data}
                width={100}
                height={500}
                options={{ maintainAspectRatio: false }} >
            </Bar>

            <div>
                <select onChange={(val) => this.getWorldData(val.target.value)}>
                    <option value="0">ALL</option>
                    <option value="1">India</option>
                    <option value="2" >United States</option>
                </select>
            </div>
        </div>);
    }

    componentWillMount()
    {
        this.getWorldData("0");
    }
    getWorldData(countryID) {  
        let URL = countryID != "0" ?  '/covidCount/country/'+countryID:'/covidCount/world';
        fetch(URL, {  
            method: 'get',  
            headers: {  
                'Accept': 'application/json',  
                'Content-Type': 'application/json'  
            },  
             
        }).then((Response) => Response.json())  
            .then((result) => {  
                let caseType = [];
                let totalCount = [];
                console.log(result);  
                result.forEach(element => {
                    caseType.push(element.ct);
                    totalCount.push(element.total);
                });
                this.setState({
                    Data:{
                        labels:caseType,
                        
                        datasets: [
                            {
                                label: 'Covid Cases',
                                data:totalCount,
                                backgroundColor : [
                                    "Red",
                                    "Blue",
                                    "Green"
                                ]
                            }
                           
                        ]
                        
                    }
                });
            })  
    } 
}

export default DashBoard;