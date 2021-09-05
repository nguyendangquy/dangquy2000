import React, { Component } from 'react';
// import Icon from '@material-ui/core/Icon';
// import heard from './../../public/assets/svg/visibility_black_24dp.svg'
import { Card, CardActionArea, CardContent, Typography, CardActions, Button } from '@material-ui/core';
export default class CardCustum extends Component {
    render() {
        const { obj } = this.props
        return (
            <div>
                <Card>
                    <CardActionArea>
                        <CardContent>
                            <Typography gutterBottom variant="h5" component="h2">
                                {obj.title}
                                {/* <Icon><img src={heard}/></Icon> */}
                            </Typography>
                            <Typography variant="body2" color="textSecondary" component="p">
                                {obj.title.userId}
                            </Typography>
                        </CardContent>
                    </CardActionArea>
                    <CardActions>
                        <Button size="small" color="primary">
                            Share
                        </Button>
                        <Button size="small" color="primary">
                            Learn More
                        </Button>
                    </CardActions>
                </Card>
            </div>
        );
    }
}
