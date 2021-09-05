import { createStore ,applyMiddleware, compose} from "redux";
import thunk from "redux-thunk";
import rootReducer from './reducers';

const initStatte = {};
const middleware = [thunk];

const store = createStore(rootReducer, initStatte, compose(applyMiddleware(...middleware)
    window._REDUX_DEVTOOL_EXTENSION_ && window.__REDUX_DEVTOOL_EXTENSION__()
));

