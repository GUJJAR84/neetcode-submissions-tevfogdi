class Solution {
public:
    int carFleet(int target, vector<int>& position, vector<int>& speed) {
        map<int,int> mpp;
        vector<double> time;

        for(int i =0;i<position.size();i++){
            mpp[position[i]]=speed[i];
        }

        for(auto it : mpp){
            time.push_back((double)(target - it.first)/it.second);
        }
        for(auto it : time){
            cout<<it<<" ";
        }

        int fleet = 1;
        double first = time[time.size()-1];
        for(int i =time.size()-2;i>=0;i--){
            if(time[i]>first){
                fleet++;
                first = time[i];
            }
        }
        return fleet;
    }
};
