package com.java.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.java.dao.CustomerDao;
import com.java.entity.Customer;
import com.java.service.CustomerService;
import com.java.swing.MsgFrame;
import java.io.File;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao = new CustomerDao();

    private final File file = new File("data");

    /**
     * 新增客户信息
     *
     * @param customer
     */
    @Override
    public void addCustomer(Customer customer) {
        int i = customerDao.addCustomer(customer);
        if (i > 0) {
            new MsgFrame("客户新增成功！");
        } else {
            new MsgFrame("客户新增失败！");
        }
    }

    /**
     * 修改客户信息
     *
     * @param customer
     */
    @Override
    public void updateCustomer(Customer customer) {
        List<Customer> allCustomer = customerDao.findAllCustomer();
        boolean flag = false;
        for (Customer customer1 : allCustomer) {
            if (customer1.getCid().equals(customer.getCid())) {
                flag = true;
            }
        }
        if (flag) {
            customerDao.updateCustomer(customer);
        } else {
            new MsgFrame("修改失败！");
        }
    }

    /**
     * @param ids
     * @return
     */
    @Override
    public void removeCustomers(List<Integer> ids) {
        int count = 0;
        for (Integer id : ids) {
            customerDao.removeCustomer(id);
            count += 1;
        }
        if (count > 0) {
            new MsgFrame("删除成功！");
        }else {
            new MsgFrame("删除失败");
        }
    }

    @Override
    public void removeCustomer(int id) {
        customerDao.removeCustomer(id);
    }

    /**
     * 查询客户信息
     *
     * @param name
     * @return
     */
    @Override
    public List<Customer> queryStudent(String name) {
        if (StrUtil.isBlank(name)) {
            return customerDao.findAllCustomer();
        }
        return customerDao.findCustomerByName(name);
    }

    @Override
    public List<Customer> getList() {
        return customerDao.findAllCustomer();
    }

    /**
     * 保存客户信息到本地
     */
    @Override
    public void savaData() {

    }

    @Override
    public void exportData() {

    }

}
