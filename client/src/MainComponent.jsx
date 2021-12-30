import React, {Component} from "react";
import axios from "axios";

class MainComponent extends Component {

    constructor(props) {
        super(props);
        this.state = {
            message: ""
        }
    }

    componentDidMount() {
        this.getApi();
    }

    getApi = () => {
        axios.get('http://localhost:8080/api/hello')
            .then(res => {
                console.log(res);
                this.setState({
                    message: res.data.message
                })
            })
            .catch(res => console.log(res))
    }
    clickEvent(){
        alert("main 버튼 클릭");
    }

    render() {
        return (
            <div>
                Main 페이지
                <div>
                    <button name='btn' onClick={this.clickEvent}>test</button>
                </div>
            </div>
        )
    }

}

export default MainComponent