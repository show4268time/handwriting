package com.showtime.jdk;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 缓存淘汰
 * @author: yaoweihao
 * @date: 2019/1/23
 * @time: 10:40
 * @modified by:
 */
public class LRUCache {
    class Node {
        String key;
        Object value;
        Node pre;
        Node next;

        public Node(String key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    int size;
    HashMap<String, Node> map = new HashMap<String, Node>();
    Node head;
    Node end;

    public LRUCache(int size) {
        this.size = size;
    }

    public Object get(String key) {
        if (map.containsKey(key)) {
            Node value = map.get(key);
            remove(value);
            setHead(value);
            return value;
        } else {
            return null;
        }
    }

    public void set(String key, Object value) {
        if (map.containsKey(key)) {
            Node old = map.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        } else {
            Node createNew = new Node(key, value);
            if (map.size() >= size) {
                map.remove(end.key);
                remove(end);
                setHead(createNew);
            } else {
                setHead(createNew);
            }
            map.put(key, createNew);
        }
    }

    public void setHead(Node node) {
        node.next = head;
        node.pre = null;
        if (head != null) {
            head.pre = node;
        }
        head = node;
        if (end == null) {
            end = node;
        }
    }

    public void remove(Node node) {
        if (node.pre != null) {
            node.pre.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.pre = node.pre;
        } else {
            end = node.pre;
        }
    }
}
