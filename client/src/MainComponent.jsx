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
            .then(res => {ddfdff
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
        const btnName = '테스트';
        const mainName = '메인 페이지';
        return (
            <div>
                {mainName}
                <div>
                    <div>
                        <input className='inputId' placeholder={'id입력'}/>
                        <input placeholder={'pw입력'}/>
                    </div>
                    <button name='btn' onClick={this.clickEvent}>{btnName}</button>
                </div>
            </div>
        )
    }

}

export default MainComponent