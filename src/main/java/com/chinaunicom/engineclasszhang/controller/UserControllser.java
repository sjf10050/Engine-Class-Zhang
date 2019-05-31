package com.chinaunicom.engineclasszhang.controller;

/**
 * @ClassName UserControllser
 * @Author sjf
 * @mail sjf10050@outlook.com
 * @Date 2019-05-31 13:47
 * @Description 用户控制类
 */

public class UserControllser {
//    @PostMapping("update")
//    @ApiOperation(value="用户修改")
//    public Map<String,String> updateUser(@Valid @RequestBody UserReq userReq){
//
//        if(userReq.getId() == null || "".equals(userReq.getId())) {
//            throw new CommonException("0000", "更新时ID不能为空");
//        }
//        User user = new User();
//        user.setCode(userReq.getCode());
//        user.setName(userReq.getName());
//        user.setId(Long.parseLong(userReq.getId()));
//        userService.updateById(user);
//        Map<String,String> result = new HashMap<String,String>();
//        result.put("respCode", "01");
//        result.put("respMsg", "更新成功");
//        return result;
//    }
//
//    @GetMapping("/get/{id}")
//    @ApiOperation(value="用户查询(ID)")
//    @ApiImplicitParam(name="id",value="查询ID",required=true)
//    public Map<String,Object> getUser(@PathVariable("id") String id){
//        //查询
//        User user = userService.selectById(id);
//        if(user == null) {
//            throw new CommonException("0001", "用户ID：" + id + "，未找到");
//        }
//        UserResp resp = UserResp.builder()
//                .id(user.getId().toString())
//                .code(user.getCode())
//                .name(user.getName())
//                .status(user.getStatus())
//                .build();
//        Map<String,Object> result = new HashMap<String,Object>();
//        result.put("respCode", "01");
//        result.put("respMsg", "成功");
//        result.put("data", resp);
//        return result;
//    }
}
