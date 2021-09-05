import { Grid, Paper, Typography } from '@material-ui/core';
import React, { Component } from 'react';
import { makeStyles } from '@material-ui/core/styles';
import CardCustum from './commoncomponent/Card';
import axios from 'axios';
import { tsConstructorType } from '@babel/types';
// import img1 from './../../public/images/lorem1'

const useStyles = makeStyles((theme) => ({
    root: {
        flexGrow: 1,
    },
    paper: {
        padding: theme.spacing(2),
        textAlign: 'center',
        color: theme.palette.text.secondary,
    },
}));

export default class Album extends Component {
    state = {
        dataAlbum: [],
        isToggle: false
    }

    async componentDidMount() {
        const res = await axios.get('https://jsonplaceholder.typicode.com/albums')
        this.setState({
            ...this.state,
            dataAlbum: res.data
        })
    }
    render() {
     
        const { dataAlbum } = this.state;
        return (
            <React.Fragment>
                 <Grid container spacing={3}>
                    <Grid item xs={12}>
                        <Paper className={useStyles.paper}><Typography variant="h2" gutterBottom>
                            This is My Albums
                        </Typography></Paper>
                    </Grid>
                    {
                        dataAlbum && dataAlbum.length >0 && 
                        dataAlbum.map(el => <Grid item xs={6}>
                            <CardCustum obj={el} key={el.id}/>
                        </Grid>)
                    }
                </Grid>
            </React.Fragment>
        );
    }
}

